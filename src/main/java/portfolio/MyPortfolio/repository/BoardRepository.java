package portfolio.MyPortfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.MyPortfolio.domain.Board;


public interface BoardRepository extends JpaRepository<Board,Long> {


}
