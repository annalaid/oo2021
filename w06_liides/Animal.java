/*1. Luua Animal tüüpi interface, tal oleks speak, eat, sleep, beSneaky, lookAround, attack, 
defend funktsioonid/meetodid ja siis vähemalt 2 loomatüüpi klassi, 
kes implementeerivad Animal interface-i ja neil oleks oma meetodite sisu ehk nad peaksid midagi tegema
*/

public interface Animal {
    public String speak();
    public void eat(String string);
    public void beSneaky();
    public void lookAround();
    public void attack();
    public void defend();
    public void attack(String string);
}
