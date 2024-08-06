package com.sp.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	@Column(length = 50, nullable = false)
	private String writer;
	
	@Column(name = "ipaddr", nullable = false, length = 50, updatable = false)
	private String ipAddr;
	
	@Column(nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	private String reg_date;
	
	@Column(name = "hitcount", nullable = false, columnDefinition = "INT DEFAULT 0", insertable = false)
	private int hitCount;
	
	// Builder 패턴을 넣게되면 인자를 순서 상관없이 넣는게 가능
	@Builder
	public Posts(String title, String content, String writer, String ipAddr) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.ipAddr = ipAddr;
	}
	
	
}
