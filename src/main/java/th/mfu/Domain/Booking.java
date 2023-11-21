package th.mfu.Domain;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "field_one")
    private String fieldOne;
    @Column(name = "field_two")
    private String fieldTwo;
    @Column(name = "field_three")
    private String fieldThree;
    @Column(name = "field_four")
    private String fieldFour;
    @Column(name = "field_five")
    private String fieldFive;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public void setFieldThree(String fieldThree) {
        this.fieldThree = fieldThree;
    }

    public String getFieldFore() {
        return fieldFour;
    }

    public void setFieldFour(String fieldFour) {
        this.fieldFour = fieldFour;
    }

    public String getFieldFive() {
        return fieldFive;
    }

    public void setFieldFive(String fieldFive) {
        this.fieldFive = fieldFive;
    }


}
