package portfolio.MyPortfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.MyPortfolio.domain.Member;

public interface MemberRepository extends JpaRepository<Member,String> {


}
