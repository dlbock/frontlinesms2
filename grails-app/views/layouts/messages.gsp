<%@ page contentType="text/html;charset=UTF-8" %>
<html>
	<head>
		<title><g:layoutTitle default="Messages"/></title>
		<g:layoutHead />
		<g:render template="/css"/>
		<link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
		<g:javascript library="jquery" plugin="jquery"/>
	</head>
	<body>
		<g:render template="/eyebrow"/>
		<g:render template="/flash"/>
		<div id="main">
			<g:render template="menu"/>
			<g:layoutBody/>
			<g:render template="message_list"/>
			<g:if test="${messageInstance != null}">
				<div id="message-details">
					<p class="message-name">${contactInstance?.name?:messageInstance?.src}</p>
					<g:def var="thisAddress" value="${messageInstance.src}"/>
					<g:link class="button" controller="contact" action="createContact" params="[address: thisAddress]">+</g:link>
					<p class="message-date"><g:formatDate format="dd-MMM-yyyy hh:mm" date="${messageInstance.dateCreated}" /></p>
					<p class="message-body">${messageInstance.text}</p>
				</div>
				<g:render template="action_list"/>
			</g:if>
		</div>
	</body>
</html>
