package eniserkaya.com.webmvc.entity;

import eniserkaya.com.webmvc.validator.TCKimlikNo;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class User {

    @NotBlank
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
    @PastOrPresent
    private Date dogumTarihi;
    @Min(value = 250)
    private String ikametgah;
    @NotBlank
    @Pattern(regexp="admin")
    private String userName;

}
