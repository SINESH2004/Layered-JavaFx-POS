package entity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;

    @OneToMany(mappedBy = "customer")
   private List<Orders> ordersList = new ArrayList<>();

    public Customer(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
