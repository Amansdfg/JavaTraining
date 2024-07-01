public class GradeExam {
    public static void main(String[] args){
        char[][] studentAnswer={
                {'A','A','B','D','E'},
                {'A','A','B','D','E'},
                {'A','D','B','D','E'},
                {'C','D','E','D','F'}
        };
        char[] key = {'A','A','B','E','E'};
        check(studentAnswer,key);
    }
    public static void check(char[][] answer,char[] key){
        for(int i=0;i< answer.length;i++){
            int counter =0;
            for(int j=0;j< answer[i].length;j++){
                if(answer[i][j]==key[j]){
                    counter++;
                }
            }
            System.out.println("Student "+ i+" has scored "+counter+ ((counter==1)?" point":" points"));
        }
    }
}
