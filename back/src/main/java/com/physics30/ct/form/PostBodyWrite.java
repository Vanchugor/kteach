package com.physics30.ct.form;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PostBodyWrite {
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 24)
    @Pattern(regexp = "[a-zA-Z ]{2,24}", message = "Expected Latin letters")
    private String title;

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 60000)
    @Lob
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
