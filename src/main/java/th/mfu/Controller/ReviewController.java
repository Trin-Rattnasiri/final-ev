package th.mfu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import th.mfu.Model.BookingModel;
import th.mfu.Model.RegisModel;
import th.mfu.Service.ReviewService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ReviewController {
    @Autowired
    ReviewService reviewService;
    @GetMapping(value = "/review")
    public List<BookingModel> review(@RequestParam Long userId) {
        return reviewService.review(userId);
    }
}
