package learning.project.service;

import learning.project.domain.Architect;
import learning.project.domain.Designer;
import learning.project.domain.Employee;
import learning.project.domain.Programmer;

public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER  = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam(){
        return team;
    }

    private boolean isExist(Employee e){
        for (int i = 0; i < total; i++) {
            if(team[i].getId()==e.getId()){
                return true;
            }
        }
        return false;
    }

    public void addMember(Employee e) throws TeamException{
        Programmer p = (Programmer)(e);
        if(total>=MAX_MEMBER)
            throw new TeamException("成员已满，无法添加");
        if(!(e instanceof Employee))
            throw new TeamException("该成员不是开发人员，无法添加");
        if(isExist(e))
            throw new TeamException("该员工已是某团队成员");
        if (((Programmer)(e)).getStatue()==Statue.BUSY)
            throw new TeamException("该员工已在本开发团队中");
        if (((Programmer)(e)).getStatue()==Statue.VOCATION)
            throw new TeamException("该员工正在休假，无法添加");
        int pNum = 0, aNum = 0, dNum = 0;
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect)
                aNum++;
            else if(team[i] instanceof Designer)
                dNum++;
            else if(team[i] instanceof Programmer)
                pNum++;
        }
//        if(e instanceof Architect && aNum>=1)
//            throw new TeamException("团队中之多只能有一名架构师");
//        if(e instanceof Designer && dNum>=2)
//            throw new TeamException("团队中之多只能有两名设计师");
//        if(e instanceof Programmer && pNum>=3)
//            throw new TeamException("团队中之多只能有三名程序员");
        if(e instanceof Architect)
            if(aNum >= 1)
                throw new TeamException("团队中之多只能有一名架构师");
        else if(e instanceof Designer)
            if(dNum >= 2)
                throw new TeamException("团队中之多只能有两名设计师");
        else
            if(pNum >= 3)
                throw new TeamException("团队中之多只能有三名程序员");

        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatue(Statue.BUSY);



    }

    public void removeMember(int memberId) throws TeamException{
        int i;
        for (i = 0; i < total; i++) {
            if(team[i].getMemberId()==memberId){
                //找到这个员工
                break;
            }
        }
        if(i==total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        for (int j = i; j < total-1; j++) {
            team[j] = team[j+1];
        }
        team[--total] = null;

    }
}
