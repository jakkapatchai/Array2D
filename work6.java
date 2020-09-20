import java.io.*;
class aa{
    static String data[][] = new String[3][3];
    public static void aaa() throws IOException{
        BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            System.out.print("enter id : ");
            data[0][i] = numid.readLine(); 
            System.out.print("enter name : ");
            data[1][i] = numid.readLine(); 
            System.out.print("enter salary : ");
            data[2][i] = numid.readLine(); 
            
        }
    }        
}
class bb extends aa{
    public static void bbb() {
        try {
            aaa();
        int sum = 0 ;
        for(int i=0;i<3;i++){ 
            sum +=Integer.parseInt(data[2][i]);              
            }
        System.out.println("Net salary = " + ((sum*0.93)-500) + " $");
        } catch (Exception e) {           
        }     
    }
}
class cc extends bb {
    public static void main(String args[]) {

        bbb();
    }
}