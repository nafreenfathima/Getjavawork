public class Address2
{
private String addline1;
private String addline2;
private String city;
private String state;
private int pin;
public Address2() {
// TODO Auto-generated constructor stub
}
public Address2(String addline1, String addline2, String city, String state, int pin) {
super();
this.addline1 = addline1;
this.addline2 = addline2;
this.city = city;
this.state = state;
this.pin = pin;
}

public String getAddline1() {
return addline1;
}

public void setAddline1(String addline1) {
this.addline1 = addline1;
}

public String getAddline2() {
return addline2;
}

public void setAddline2(String addline2) {
this.addline2 = addline2;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public int getPin() {
return pin;
}

public void setPin(int pin) {
this.pin = pin;
}
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
        sb.append(this.addline1).append("\n");
        sb.append(this.addline2).append("\n");
        sb.append(this.city).append("\n");
        sb.append(this.state).append("\n");
        sb.append(this.pin);
        return sb.toString();
}



}
