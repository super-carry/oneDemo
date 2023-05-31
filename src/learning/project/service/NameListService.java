package learning.project.service;

import learning.project.domain.*;

import java.net.Proxy;

import static learning.project.service.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService(){
//        根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[EMPLOYEES.length];
//        再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
//                将对象存于数组中
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            switch(type){
                case(EMPLOYEE):
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case(ARCHITECT):
                    Equipment equipment = createEquipment(i);
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
                case(PROGRAMMER):
                    employees[i] = new Programmer(id,name,age,salary,createEquipment(i));
                    break;
                case(DESIGNER):
                    employees[i] = new Designer(id,name,age,salary,createEquipment(i),Double.parseDouble(EMPLOYEES[i][5]));
                    break;
            }

        }
//        Data类位于com.atguigu.team.service包中

    }

    private Equipment createEquipment(int index){
        String name = EQUIPMENTS[index][1];
        String display = EQUIPMENTS[index][2];
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        switch(type){
            case(PC):
                return new PC(name, display);
            case(NOTEBOOK):
                return new NoteBook(name, Double.parseDouble(display));
            case(PRINTER):
                return new Printer(name, display);
        }
        return null;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * 获取指定id的员工
     * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(id==employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
