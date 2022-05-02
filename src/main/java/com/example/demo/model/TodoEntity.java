package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Builder는 오브젝트 생성을 위한 디자인 패턴
 * No~는 매개변수가 없는 생성자 구현
 * All~은 클래스의 모든 멤버 변수를 매개변수로 받는 생성자 구현
 * Data는 getter/setter 메서드 구현
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
	private String id;		//오브젝트의 아이디
	private String userId;	//오브젝트를 생성한 사용자의 아이디
	private String title;	//Todo 타이틀
	private boolean done;	//true - todo를 완료한 경우(checked)
}
