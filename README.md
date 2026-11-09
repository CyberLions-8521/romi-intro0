# romi-intro0
Starter code for working with the Romi using WPILib version 2026.2.1 (the last supported version for the roboRIO).

See other branches for later versions of WPILib.

# List of Functions
## Drivetrain Functions
| Function | Description |
|---|---|
| `drive(double speed, double turn)` | Controls drivetrain movement using `speed` and `turn` values ranging from `-1.0` to `1.0`. Positive speed drives forward, and positive turn rotates counter-clockwise. |
| `driveForward()` | Drives the robot forward |
| `driveReverse()` | Drives the robot backward |
| `stop()` | Stops the drivetrain. |

## Encoders and Sensors
| Function | Description |
|---|---|
| `resetEncoders()` | Resets both left and right drive wheel encoders to zero. |
| `getLeftDistanceInch()` | Returns the distance tracked by the left wheel encoder in inches. |
| `getRightDistanceInch()` | Returns the distance tracked by the right wheel encoder in inches. |
| `getHeading()` | Returns the current robot orientation/heading angle from the gyro. |
| `resetGyro()` | Resets the gyro heading value to zero. |

## Onboard Input/Output Buttons
| Function | Description |
|---|---|
| `getRomiAPressed()` | Returns `true` if onboard Button A was just pressed down this frame. |
| `getRomiBPressed()` | Returns `true` if onboard Button B was just pressed down this frame. |
| `getRomiCPressed()` | Returns `true` if onboard Button C was just pressed down this frame. |

## Keyboard Controller
| Function | Description |
|---|---|
| `getZButtonPressed()` | Returns `true` if the 'Z' key/button was just pressed down this frame. |
| `getZButton()` | Returns `true` continuously while the 'Z' key/button is held down. |
| `getZButtonReleased()` | Returns `true` if the 'Z' key/button was just released this frame. |
| `getXButtonPressed()` | Returns `true` if the 'X' key/button was just pressed down this frame. |
| `getXButton()` | Returns `true` continuously while the 'X' key/button is held down. |
| `getXButtonReleased()` | Returns `true` if the 'X' key/button was just released this frame. |
| `getCButtonPressed()` | Returns `true` if the 'C' key/button was just pressed down this frame. |
| `getCButton()` | Returns `true` continuously while the 'C' key/button is held down. |
| `getCButtonReleased()` | Returns `true` if the 'C' key/button was just released this frame. |
| `getVButtonPressed()` | Returns `true` if the 'V' key/button was just pressed down this frame. |
| `getVButton()` | Returns `true` continuously while the 'V' key/button is held down. |
| `getVButtonReleased()` | Returns `true` if the 'V' key/button was just released this frame. |
| `getPOV()` | Returns the D-pad/POV angle value from the controller in degrees. |
| `getADAxis()` | Returns horizontal steering axis value from `-1.0` to `1.0`. Pushing "left" (A) returns a negative value. |
| `getWSAxis()` | Returns vertical throttle axis value from `-1.0` to `1.0`. Pushing "up" (W) returns a negative value. |
| `getERAxis()` | Returns secondary axis value from `-1.0` to `1.0`. Pressing 'R' returns a positive value. |