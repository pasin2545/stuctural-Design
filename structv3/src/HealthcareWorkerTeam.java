import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();

    public void addMenber(HealthcareServiceable mem){
        members.add(mem);
    }

    public void removeMember(HealthcareServiceable mem){
        members.remove(mem);
    }

    public void service(){
        for(HealthcareServiceable mem:members){
            mem.service();
        }
    }

    public double getPrice(){
        double price = 0;
        for(HealthcareServiceable mem:members){
            price+=mem.getPrice();
        }
        return price;
    }
}
