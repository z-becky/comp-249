package Deductions;
import Employee.*;

abstract class Deductions extends Employee{
    protected double payDeduction = 0;

    abstract void calculateTax();
}
