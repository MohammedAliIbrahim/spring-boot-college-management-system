<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Instructor Profile</title>

<link rel="stylesheet" type="text/css"
	href="http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css"
	media="all" />
<link rel="stylesheet" type="text/css"
	href="${contextRoot}/static/css/resume.css" media="all" />

</head>
<body>

	<c:choose>

		<c:when test="${mode=='MODE_INSTRUCTOR_PROFILE'}">
			<div id="doc2" class="yui-t7">
				<div id="inner">
					<div class="profile_img">
						<img src="${instructorProfile.code }">
					</div>
					<div id="hd">
						<div class="yui-gc">
							<div class="yui-u first">
								<h1>${instructorProfile.user.firstname}
									${instructorProfile.user.lastname}</h1>
								<h2>${instructorProfile.rank}</h2>
							</div>

							<div class="yui-u">
								<div class="contact-info">
									<h3>
										<a id="pdf" href="#">Download PDF</a>
									</h3>
									<h3>
										<a href="mailto:name@yourdomain.com">${instructorProfile.user.email}</a>
									</h3>
									<h3>${instructorProfile.user.mobile}</h3>
								</div>
								<!--// .contact-info -->
							</div>
						</div>
						<!--// .yui-gc -->
					</div>

					<div id="bd">
						<div id="yui-main">
							<div class="yui-b">

								<div class="yui-gf">
									<div class="yui-u first">
										<h2>Other Titles</h2>
									</div>
									<div class="yui-u">
										<p class="enlarge">${instructorProfile.otherTitles}</p>
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
										<h2>Courses Taught</h2>
									</div>
									<div class="yui-u">
										<c:forEach var="course1" items="${instructorProfile.courses }">
											<p class="enlarge">
												<a href="/">${course1.name} </a>   <br>
											</p>
											</c:forEach>
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
										<p class="enlarge">${instructorProfile.resarchInterests}</p>
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
										<h2>Current Research</h2>
									</div>
									<div class="yui-u">
										<p class="enlarge">${instructorProfile.currentResearch}</p>
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
										<p class="enlarge">${instructorProfile.education}</p>
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
										<h2>Time at Tanta</h2>
									</div>
									<div class="yui-u">
										<p class="enlarge">${instructorProfile.timeAtTanta}</p>
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
										<h2>Current Activities</h2>
									</div>
									<div class="yui-u">
										<p class="enlarge">${instructorProfile.currentActivities}</p>
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
									<div class="yui-u first"></div>
									<div class="yui-u">

										<a href="/edit-instructor-profile?id=${instructorProfile.id }">
											<button name="edit" class="edit">Edit</button>
										</a>


									</div>
								</div>

							</div>
						</div>
					</div>

				</div>
			</div>

		</c:when>


		<c:when test="${mode=='MODE_UPDATE_PRO' }">
			<div id="doc2" class="yui-t7">
				<div id="inner">
					<div class="profile_img">
						<form class="FORM" method="POST" action="instructor-profile-saved">


							<label style="font-size: 20px">choose your image profile</label><br>
							<br>
							<div class="upload">
								<input type="file" name="pic" accept="image/*" value="Upload"
									src="${contextRoot}/static/images/ggg.png">

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