package com.mobicare.mobicareservices.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ResponseError {

	public ResponseError(LocalDateTime timestamp, String message, List<String> erros) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.erros = erros;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private List<String> erros;
	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the erros
	 */
	public List<String> getErros() {
		return erros;
	}
	/**
	 * @param erros the erros to set
	 */
	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}