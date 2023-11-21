package th.mfu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.mfu.Model.BookingModel;
import th.mfu.Model.RegisModel;
import th.mfu.Service.BookingService;

import javax.validation.Valid;
import java.util.List;


@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping(value = "/booking", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookingModel> booking(@Valid @RequestBody BookingModel bookingModel) {
        return bookingService.booking(bookingModel);
    }
}

