public class GitTestingRunner implements GitTesting{
    public static void main(String[]args){
        GitTesting gitTesting = (int n) -> (Math.sqrt(n)) ==  (int)(Math.sqrt(n));
        System.out.println(gitTesting.perfectSquare(5));

    }
}