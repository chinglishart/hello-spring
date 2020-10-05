package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
    * 회원 가입
    * */
    public Long joins(Member member) {
        //같은 이름 x

        Optional<Member> byId = memberRepository.findById(member.getName());
        memberRepository.save(member);
        return member.getId();
    }
}
