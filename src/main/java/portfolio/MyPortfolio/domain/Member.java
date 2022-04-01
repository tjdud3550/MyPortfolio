package portfolio.MyPortfolio.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //access 레벨 알아두기'

public class Member {
    @Id
    @GeneratedValue //식별자인식, pk가 자동입력
    @Column(name = "member_id")
    private  Long id;
    private  String username;
    private int age;
}
