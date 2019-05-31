package ProjectRunner;

import gitproject.GitInterface;
import gitproject.GitProject;

public class ProjectRunner implements GitInterface{

    @Override
    public void doStuff(float a, float b) {
        
    }
    
    public static void main(String[]args){
        GitProject gitProject = (a,b) -> System.out.printf("'%.3f'%n",a/b);
        gitProject.doStuff(3402, 10000);
    }
    
}
