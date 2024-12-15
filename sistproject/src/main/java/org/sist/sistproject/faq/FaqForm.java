package org.sist.sistproject.faq;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FaqForm {
	@NotBlank(message = "제목은 필수항목입니다.")
	@Size(max = 200)
	private String title;
	
	@NotBlank(message = "내용은 필수항목입니다.")
	private String content;
	
	/*
	@NotBlank
	private LocalDateTime createDate;
	
	 @NotBlank
	 private String author; 
	 
	 
	  
	 @Email private String email;
	 */
	
}