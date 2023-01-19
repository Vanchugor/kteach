package com.physics30.ct.form;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CommentBodyWrite {
    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 60000)
    @Lob
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
