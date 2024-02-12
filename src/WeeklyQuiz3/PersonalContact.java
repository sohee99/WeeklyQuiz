package WeeklyQuiz3;

public class PersonalContact extends Contact{

    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship){
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship(){
        return  relationship;
    }

    @Override
    public String toString(){
        return String.format("이름: %s, 전화번호: %s, 관계: %s",getName(),getPhoneNumber(),getRelationship());
    }
}
