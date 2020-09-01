package snippet;

public class Snippet {
	Feature: Update password
	
	Scenario: Admin user can update the user password
	Given I am in the HR system with an Admin account
	When I update password of another user
	Then I receive a message for updating password successfully
	And user's password is updated to the new password
	
	Scenario: Viewer user cannot update the user password
	Given I am in the HR system with a Viewer account
	When I update password of another user
	Then I receive a message for not able to update the user password
	And user's password remains the same
}

