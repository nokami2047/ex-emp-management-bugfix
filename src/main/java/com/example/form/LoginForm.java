package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {

	/** メールアドレス */
	@Email(message = "メールアドレスの形式が不正です")
	@NotBlank(message = "メールアドレスが未入力です")
	private String mailAddress;
	/** パスワード */
	@Size(min=1, max=16, message="パスワードは１文字から１６文字以内で入力してください")
	@NotBlank(message = "パスワードが未入力です")
	private String password;

	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
