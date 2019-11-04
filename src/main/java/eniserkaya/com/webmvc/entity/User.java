package eniserkaya.com.webmvc.entity;

import eniserkaya.com.webmvc.validator.TCKimlikNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank(message = "İsim boş bırakılamaz.")
    private String isim;
    @NotBlank
    private String soyIsim;
    @Min(value = 12)
    @Min(value = 100)
    private int yas;
    @Email
    @NotBlank
    private String email;
    @TCKimlikNo
    private String tcKimlikNo;
    @DateTimeFormat(pattern = "dd/MM/yyyy") // This is for bind Date with @ModelAttribute
    @PastOrPresent
    private LocalDateTime dogumTarihi;
    @Size(max = 250)
    private String ikametgah;
    @NotBlank
    private String userName;

    @AssertTrue
    public boolean isUserNamePublic(){
        return !userName.equals("admin");
    }

}
