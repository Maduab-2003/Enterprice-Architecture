/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;
public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    public Employee(int id, String name, String position, double salary) { this.id = id;
    this.name = name;
    this.position = position;
    this.salary = salary;
 }
   
 // Getters and setters
 public int getId() { return id; }
 public void setId(int id) { this.id = id; }
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }
 public String getPosition() { return position; }
 public void setPosition(String position) { this.position = position; } public double getSalary() { return salary; }
 public void setSalary(double salary) { this.salary = salary; }
 @Override
 public String toString() {
 return "Employee{id=" + id + ", name='" + name + "', position='" + position + "', salary=" + salary + '}';
 }
} 
