package entities;

public class Employee{
//criando as classes
    private int id;
    private String name;
    private double salary;
     //criando um construtor simples
   public Employee(){
       
   }
   //construtor padrao 
   public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//encapsulando o salary
    public double getSalary() {
        return salary;
    }
// classe para incrementar o o salary
   public void increaseSalary(double percentage){
       salary = salary * percentage /100;
       
   }
//mostrar os valores no toString
   public String toString(){
       return "id: "+id+"\n"+
               "name :"+name+"\n"+
                "salary: "+ salary;      
   }

}