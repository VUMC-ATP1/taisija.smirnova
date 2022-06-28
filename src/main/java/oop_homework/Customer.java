package oop_homework;

import lombok.ToString;

@ToString
public class Customer {
    public String name;
    public boolean isMemberCard = false;
    public String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMemberCard() {
        return isMemberCard;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberCard(boolean memberCard) {
        isMemberCard = memberCard;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}




