package ie.gmit;

/*
    Employee Class - Holds employees' name and id

    G00353112
    Renan Moraes
    12/03/2020
 */
public class Employee {

    private String name;
    private int id;

    public Employee(int id, String name){
        if(name.length()<5){
            throw new IllegalArgumentException("Invalid name length");
        }
        if(countDigits(id) < 5 ){
            throw new IllegalArgumentException("Employee Number should be 5 digits");
        }
        else{
            setName(name);
            setId(id);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int countDigits(int num){
        int count = 0;
        while (num != 0){
            num /= 10;
            ++count;
        }
        return count;
    }

}
