package cloud.studyspringsecurity.auth.type;

import cloud.studyspringsecurity.auth.model.OAuth2ProviderTypes;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

public class NaverType extends OAuth2ProviderTypes {

    public NaverType(OAuth2User oAuth2User, ClientRegistration clientRegistration) {
        super(oAuth2User.getAttributes() , oAuth2User, clientRegistration);
    }

    @Override
    public String getId() {
        Map<String, Object> response = (Map<String, Object>) getAttributes().get("response");
        return (String) response.get("email");
    }

    @Override
    public String getName() {
        Map<String, Object> response = (Map<String, Object>) getAttributes().get("response");
        return (String) response.get("name");
    }
}
