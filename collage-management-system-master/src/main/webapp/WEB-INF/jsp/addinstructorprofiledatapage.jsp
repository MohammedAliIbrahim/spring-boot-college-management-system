<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>fill your data</title>
<link rel="stylesheet" type="text/css"
	href="http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css"
	media="all" />
<link rel="stylesheet" type="text/css"
	href="${contextRoot}/static/css/resume11.css" media="all" />
</head>
<body>



	<c:choose>
		<c:when test="${mode=='MODE_ADD_INSTRUCTOR_PROFILE_DATA' }">

			<div id="doc2" class="yui-t7">
				<div id="inner">
					<div class="profile_img">
						<form class="FORM" method="POST" action="instructor-profile-saved"
							enctype="mulipart/form-data">


							<label style="font-size: 20px">choose your image profile</label><br>
							<br>
							<div class="upload">
								<input type="file" name="pic" accept="image/*" value="Upload">


							</div>
							<br> <br>

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">
										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Rank</h2>
											</div>
											<div class="yui-u">
												<textarea name="Rank" style="width: 100%; height: 100px">${instructorProfile.rank}</textarea>

											</div>
										</div>
									</div>
								</div>
							</div>

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">
										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Other titles</h2>
											</div>
											<div class="yui-u">
												<textarea name="Other titles"
													style="width: 100%; height: 100px">${instructorProfile.otherTitles}</textarea>

											</div>
										</div>
									</div>
								</div>
							</div>

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Research Interests</h2>
											</div>
											<div class="yui-u">
												<textarea name="Research Interests"
													style="width: 100%; height: 100px">${instructorProfile.resarchInterests}</textarea>
											</div>
										</div>
									</div>
								</div>
							</div>





							<!--// .yui-gf-->


							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Current Research</h2>
											</div>
											<div class="yui-u">
												<textarea name="Current Research"
													style="width: 100%; height: 100px">${instructorProfile.currentResearch}</textarea>

											</div>
										</div>
									</div>
								</div>
							</div>


							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Education</h2>
											</div>
											<div class="yui-u">
												<textarea name="Education"
													style="width: 100%; height: 100px">${instructorProfile.education}</textarea>
											</div>
										</div>
									</div>
								</div>
							</div>

							<!--another-->
							<!--another-->

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Time at tanta</h2>
											</div>
											<div class="yui-u">
												<textarea name="Time at stanford"
													style="width: 100%; height: 100px">${instructorProfile.timeAtTanta}</textarea>

											</div>
										</div>
									</div>
								</div>
							</div>

							<!--another-->
							<!--another-->

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Courses Taught</h2>
											</div>
											<div class="yui-u">
												<textarea name="Courses Taught"
													style="width: 100%; height: 100px">${instructorProfile.coursesTaught}</textarea>

											</div>
										</div>
									</div>
								</div>
							</div>
							<!--another-->
							<!--another-->

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2>Current Activities</h2>
											</div>
											<div class="yui-u">
												<textarea name="Current Activities"
													style="width: 100%; height: 100px">${instructorProfile.currentActivities}</textarea>

											</div>
										</div>

									</div>
								</div>
							</div>

							<!--another-->

							<div id="bd">
								<div id="yui-main">
									<div class="yui-b">

										<div class="yui-gf">
											<div class="yui-u first">
												<h2></h2>
											</div>
											<div class="yui-u">
												<input type="submit" class="sub" value="Submit">
											</div>
										</div>
										<!--// footer -->

									</div>
									<!-- // inner -->


								</div>
								<!--// doc -->
							</div>

						</form>
					</div>
				</div>
			</div>
		</c:when>


	</c:choose>
</body>
</html>