package WeeklyQuiz3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        String name;
        String phoneNumber;
        int choiceNumber;

        while (true) {
            System.out.println("""
                    ---------------------
                    1. 비즈니스 연락처 추가
                    2. 개인 연락처 추가
                    3. 연락처 출력
                    4. 연락처 검색
                    5. 종료
                    ---------------------
                      메뉴를 선택해주세요 :""");

            choiceNumber = Integer.parseInt(scanner.next());
            switch (choiceNumber) {
                case 1:
                    System.out.print("이름을 입력하세요:");
                    name = scanner.next();
                    System.out.print("전화번호를 입력하세요:");
                    phoneNumber = scanner.next();
                    System.out.print("회사명을 입력하세요:");
                    String company = scanner.next();
                    addressBook.contacts.add(new BusinessContact(name, phoneNumber, company));
                    break;
                case 2:
                    System.out.print("이름을 입력하세요:");
                    name = scanner.next();
                    System.out.print("전화번호를 입력하세요:");
                    phoneNumber = scanner.next();
                    System.out.print("관계를 입력하세요:");
                    String relationship = scanner.next();
                    addressBook.contacts.add(new PersonalContact(name, phoneNumber, relationship));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요:");
                    name =scanner.next();
                    addressBook.searchContacts(name);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 번호 확인 후 다시 입력부탁드립니다.");
            }
        }
    }
}
