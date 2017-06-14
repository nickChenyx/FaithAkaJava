package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/15.
 */
public class TableCreator {
    public static void main(String[] args) throws Exception{
        if (args.length < 1){
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for (String className : args){
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null){
                System.out.println("No DBTable annotations in class " + className);
                continue;
            }
            String tableName = dbTable.name();
            // 如果没有设置表名，就用类名作为表名
            if (tableName.length()<1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<String>();
            for(Field field : cl.getDeclaredFields()){
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if(anns.length < 1)
                    continue; // 不是数据库表元素
                if (anns[0] instanceof SQLInteger){
                    SQLInteger sInt = (SQLInteger) anns[0];
                    // 如果没有设置表元素名，就是用字段名代替
                    if (sInt.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sInt.name();
                    columnDefs.add(columnName + " INT" +
                                getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SQLString){
                    SQLString sString = (SQLString) anns[0];

                    if(sString.name().length()<1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sString.name();
                    columnDefs.add(columnName + " VARCHAR(" +
                                    sString.value()+ ") " + getConstraints(sString.constraints()));
                }
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " +
                        tableName +"(");
                for (String columnDef : columnDefs)
                    createCommand.append("\n    "+ columnDef + ",");

                String tableCreate = createCommand.substring(0, createCommand.length()-1) + ");";
                System.out.println("Table Creation SQL for " + className+ "is :\n" + tableCreate);

            }
        }
    }

    private static String getConstraints(Constraints con){
        String constraints = "";
        if (!con.allowNull())
            constraints += " NOT NULL";
        if (con.primaryKey())
            constraints += " PRIMARY KEY";
        if (con.unique())
            constraints += " UNIQUE";
        return constraints;
    }
}
