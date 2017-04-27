package util;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lzz on 17/4/27.
 */
public class TestSqlParser {
    @Test
    public void testStr(){
        SqlParser sqlParser = new SqlParser();
        String sql = "select * from table1 where {user_name='$name'} and {password=$pass} group by {$abc} , {$abb} order by {$aby}, aa";
        //如果 name 为空清空括号内
        String name = "";
        String name_key = "$name";
        HashMap hm = new HashMap();
        hm.put("$name", "cda");
        hm.put("$pass", "tre");
        hm.put("$abc", "a");
        hm.put("$abb", "fds");
        hm.put("$aby", "fdas");
        sql = sqlParser.syntaxParser(sql, hm);
        System.out.println(sql);

    }


}
