// In companies do like this ENCAPSULATION. 
class Data{
    private Integer num;
    private String name;
    Data(int num,String name){
        this.num=num;
        this.name=name;
    }
    public void getNum(int num){
        this.num=num;
    }
    public void getName(String name){
        this.name=name;
    }
    public Integer setNum(int num){
        return num;
    }
    public String setName(String name){
        return name;
    }
}

//but for easier purpose do this
class Data2{
    public String name;
    public Integer num;
    public String Naming(String name){
        this.name=name;
        return name;
    }
    public Integer Numbering(int num){
        this.num=num;
        return num;
    }
}
public class CustomizedDatatypes{
    public static void main(String[] args){
        Data obj1=new Data(60,"Nabeel");
        Data obj2=new Data(12,"tada");
    }
}