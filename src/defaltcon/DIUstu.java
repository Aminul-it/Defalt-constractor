
package defaltcon;

public class DIUstu {
    
    private String name;
    private String phone;
    private int age ;
    private  String seid;

    public DIUstu(String name, String phone, int age, String seid) {
        this.name = name;
        this.phone = phone;
        
        if(age>20 && age <= 50){
            this.age = age;
            
        }else{
            System.out.println("Age should be between  20 and 50");
        }
       
        this.seid = seid;
    }
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }
    
    
   
    public String getInfo(){
        return name +"\n"+ phone +"\n" +age +"\n"+ seid;
    }
    
    
}
