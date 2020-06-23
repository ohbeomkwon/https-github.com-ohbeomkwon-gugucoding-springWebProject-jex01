package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;
	@DateTimeFormat(pattern = "yy/MM/dd")
	private Date dueDate;
//	@DateTimeFormat 어노테이션을 이용하는 경우에는 @InitBinder가 필요없게된다.
//	@DateTimeFormat의 pattern 대로 값이 들어오면 자동으로 날짜타입으로 바뀐다.
}
