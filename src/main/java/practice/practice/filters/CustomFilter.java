package practice.practice.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 코드 (생략 가능)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 요청 전처리 코드 (필터가 적용되는 부분)

        // 현재 사용자의 Authentication 객체를 가져옵니다.
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // 인증된 사용자의 이름을 가져옵니다.
        String username = authentication.getName();

        if(username.equals("anonymousUser")) {
            username = "";
        };

        // Model 객체에 사용자 이름을 추가합니다.
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            httpRequest.setAttribute("username", username);
        }

        // 다음 필터로 전달 또는 실제 서블릿 또는 컨트롤러로 요청 전달
        chain.doFilter(request, response);


        // 응답 후처리 코드 (필터가 적용되는 부분)
    }

    @Override
    public void destroy() {
        // 필터 소멸 코드 (생략 가능)
    }
}
