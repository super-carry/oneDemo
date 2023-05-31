package learning.project.junit;

import learning.project.domain.Employee;
import learning.project.service.NameListService;
import learning.project.service.TeamException;
import org.junit.jupiter.api.Test;

public class NameListServiceTest {
    @Test
    public void test(){
        System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t使用设备");
        NameListService nls = new NameListService();
        Employee[] employees = nls.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService nameListService = new NameListService();
        int id = 13;
        Employee employee = null;
        try {
            employee = nameListService.getEmployee(id);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(employee);
    }
}
