public class program {
    
        String name;
        long phone;
    
        program(){
            this.name=null;
            this.phone=0;
        }
    
    program(String name,long phone){
        // calling default constructor(constructor chaining)
        // this();
        // this.name=name;
        this.phone=phone;
    }
    
    program getObject(){
        // returning current object ie the object invoke this method 
        return this;
    }
    
    public static void main(String[] args){
        program ob= new program ("john",98989876);
        System.out.println(ob.name);
        program ob1=ob.getObject();
        if(ob1==ob){
            System.out.println("same object reference");
        }
        System.out.println(ob);
        System.out.println(ob1);

    }
    
}
