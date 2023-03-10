package rs.urosvesic.coreservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * @author UrosVesic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Dto{

    private String userId;
    private String username;
    private String email;
    private Instant created;
    private int numOfFollowers;
    private int numOfFollowing;
    private boolean followedByCurrentUser;
    private int mutualFollowers;
    private String bio;
}
