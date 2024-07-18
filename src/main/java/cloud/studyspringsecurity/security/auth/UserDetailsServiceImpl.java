package cloud.studyspringsecurity.security.auth;

import cloud.studyspringsecurity.member.entity.Member;
import cloud.studyspringsecurity.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberRepository
                .findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("사용자의 대한 정보를 찾을수없습니다."));

        log.info("사용자 이름 = {}", member.toString());

        return UserPrincipal.create(member);
    }
}
