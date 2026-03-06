package dev.lullu.Fridge.model;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Usado para ser gerado o id como identidade
    private Long id; //Long é como se fosse integer, mas para grandes volumes de dados
    private String name;
    private LocalDate expirationDate; //LocalDate é uma classe que representa uma data (ano, mês, dia)[Essa ordem, pois é ISO-8601] sem fuso horário. Ideal para datas de nascimento ou vencimentos.
    private Integer quantity;


//Construtor NoArgs
    public Food() {

    }

//Construtor com args
    public Food(Long id, String name, LocalDate expirationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }


//Getters
public Long getId() {
    return id;
}

public String getName() {
    return name;
}

public LocalDate getExpirationDate() {
    return expirationDate;
}

public Integer getQuantity() {
    return quantity;
}

//Setters
public void setId(Long id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}


}
