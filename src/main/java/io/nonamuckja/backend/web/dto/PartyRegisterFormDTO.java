package io.nonamuckja.backend.web.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import io.nonamuckja.backend.domain.Address;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PartyRegisterFormDTO {

	private Address address;
	@Range(min=1,max=10)
	private Long limitMemberCount;
}
