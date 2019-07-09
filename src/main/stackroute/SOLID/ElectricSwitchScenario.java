/*
  
 */
package main.stackroute.SOLID;

public class ElectricSwitchScenario
{
    public static void main(String[] args) {
        Switch aSwitch=new Switch();
        aSwitch.switchOn();
        aSwitch.switchOff();
    }

}
class Switch
{
    int flag=1;
    void switchOn()
    {
        if (flag==1)
        {
            System.out.println("The Switch is ON..!!");
        }
    }
    void switchOff()
    {
        if (flag==0)
        {
            System.out.println("The Switch is OFF..!!");
        }
    }
}