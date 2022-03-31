package portfolio.MyPortfolio.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.MyPortfolio.domain.Comment;

@Repository

public interface CommentRepository extends JpaRepository<Comment, String> {
}
